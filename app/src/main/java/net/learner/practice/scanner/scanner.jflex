package net.learner.practice.scanner;

import java.util.ArrayList;
import java.util.HashMap;
import java_cup.runtime.*;
import net.learner.practice.parser.*;

%%
%public
%class Scanner
%unicode
%line
%column
%ignorecase
%cupsym sym
%cup

%{
	public boolean hasErrors () {
		return errors.size() != 0;
	}

	public ArrayList<HashMap<String, String>> errors = new ArrayList<>();

	private Symbol symbol(int type) {
	  return new Symbol(type, yyline, yycolumn);
	}
	private Symbol symbol(int type, Object value) {
	  return new Symbol(type, yyline, yycolumn, value);
	}
%}

// single characters
plus    = "+"
minus    = "-"
multiplication = "*"
division    = "/"
oParen  = "("
cParen  = ")"
comma	= ","

// single words
graph   = "graficar"
circle  = "circulo"
square  = "cuadrado"
rectangle = "rectangulo"
line    = "linea"
polygon = "poligono"

// colors
blue    = "azul"
red     = "rojo"
green   = "verde"
yellow  = "amarillo"
orange  = "anaranjado"
purple  = "morado"
brown   = "cafe"
black   = "negro"

// er
integer = [0-9][0-9]*

%%
{plus} { return symbol(sym.plus); }
{minus} { return symbol(sym.minus); }
{multiplication} { return symbol(sym.multiplication); }
{division} { return symbol(sym.division); }
{oParen} { return symbol(sym.oParen); }
{cParen} { return symbol(sym.cParen); }
{comma} { return symbol(sym.comma); }

{graph} { return symbol(sym.graph); }
{circle} { return symbol(sym.circle); }
{square} { return symbol(sym.comma); }
{rectangle} { return symbol(sym.rectangle); }
{line} { return symbol(sym.line); }
{polygon} { return symbol(sym.polygon); }

{blue} { return symbol(sym.blue); }
{red} { return symbol(sym.red); }
{green} { return symbol(sym.green); }
{yellow} { return symbol(sym.yellow); }
{orange} { return symbol(sym.orange); }
{purple} { return symbol(sym.purple); }
{brown} { return symbol(sym.brown); }
{black} { return symbol(sym.black); }

{integer} { return symbol(sym.integer); }

. {
	System.out.println("Line: " + (yyline+1) + " Column: " + (yycolumn+1) + " - Lexical error in: " + yytext());
	HashMap<String, String> error = new HashMap<>();
	error.put("line", Integer.toString(yyline + 1));
    error.put("column", Integer.toString(yycolumn +1));
    error.put("text", yytext());
    error.put("number", Integer.toString(errors.size() + 1));
    errors.add( error );
}


