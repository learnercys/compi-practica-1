
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sat Aug 22 15:05:06 CST 2015
//----------------------------------------------------

package net.learner.practice.parser;

import java_cup.runtime.*;
import java.util.ArrayList;
import net.learner.practice.Shape;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sat Aug 22 15:05:06 CST 2015
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\034\000\002\002\004\000\002\002\003\000\002\002" +
    "\004\000\002\003\004\000\002\004\003\000\002\004\003" +
    "\000\002\004\003\000\002\004\003\000\002\004\003\000" +
    "\002\005\014\000\002\006\014\000\002\007\016\000\002" +
    "\010\016\000\002\011\020\000\002\013\003\000\002\013" +
    "\003\000\002\013\003\000\002\013\003\000\002\013\003" +
    "\000\002\013\003\000\002\013\003\000\002\013\003\000" +
    "\002\012\005\000\002\012\005\000\002\012\005\000\002" +
    "\012\005\000\002\012\005\000\002\012\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\132\000\004\013\005\001\002\000\006\002\133\013" +
    "\005\001\002\000\014\014\010\015\020\016\014\017\021" +
    "\020\015\001\002\000\006\002\000\013\000\001\002\000" +
    "\006\002\ufffb\013\ufffb\001\002\000\004\010\122\001\002" +
    "\000\006\002\ufffe\013\ufffe\001\002\000\006\002\ufff9\013" +
    "\ufff9\001\002\000\006\002\ufffd\013\ufffd\001\002\000\004" +
    "\010\107\001\002\000\004\010\072\001\002\000\006\002" +
    "\ufffc\013\ufffc\001\002\000\006\002\ufffa\013\ufffa\001\002" +
    "\000\004\010\061\001\002\000\004\010\022\001\002\000" +
    "\006\010\023\021\025\001\002\000\006\010\023\021\025" +
    "\001\002\000\014\004\030\005\027\006\032\007\031\012" +
    "\026\001\002\000\016\004\uffe6\005\uffe6\006\uffe6\007\uffe6" +
    "\011\uffe6\012\uffe6\001\002\000\006\010\023\021\025\001" +
    "\002\000\006\010\023\021\025\001\002\000\006\010\023" +
    "\021\025\001\002\000\006\010\023\021\025\001\002\000" +
    "\006\010\023\021\025\001\002\000\016\004\uffe9\005\uffe9" +
    "\006\uffe9\007\uffe9\011\uffe9\012\uffe9\001\002\000\016\004" +
    "\uffe8\005\uffe8\006\uffe8\007\uffe8\011\uffe8\012\uffe8\001\002" +
    "\000\016\004\uffeb\005\uffeb\006\032\007\031\011\uffeb\012" +
    "\uffeb\001\002\000\016\004\uffea\005\uffea\006\032\007\031" +
    "\011\uffea\012\uffea\001\002\000\014\004\030\005\027\006" +
    "\032\007\031\012\040\001\002\000\006\010\023\021\025" +
    "\001\002\000\014\004\030\005\027\006\032\007\031\012" +
    "\042\001\002\000\006\010\023\021\025\001\002\000\014" +
    "\004\030\005\027\006\032\007\031\012\044\001\002\000" +
    "\022\022\055\023\046\024\050\025\053\026\051\027\054" +
    "\030\052\031\047\001\002\000\004\011\056\001\002\000" +
    "\004\011\ufff2\001\002\000\004\011\uffec\001\002\000\004" +
    "\011\ufff1\001\002\000\004\011\uffef\001\002\000\004\011" +
    "\uffed\001\002\000\004\011\ufff0\001\002\000\004\011\uffee" +
    "\001\002\000\004\011\ufff3\001\002\000\006\002\ufff5\013" +
    "\ufff5\001\002\000\014\004\030\005\027\006\032\007\031" +
    "\011\060\001\002\000\016\004\uffe7\005\uffe7\006\uffe7\007" +
    "\uffe7\011\uffe7\012\uffe7\001\002\000\006\010\023\021\025" +
    "\001\002\000\014\004\030\005\027\006\032\007\031\012" +
    "\063\001\002\000\006\010\023\021\025\001\002\000\014" +
    "\004\030\005\027\006\032\007\031\012\065\001\002\000" +
    "\006\010\023\021\025\001\002\000\014\004\030\005\027" +
    "\006\032\007\031\012\067\001\002\000\022\022\055\023" +
    "\046\024\050\025\053\026\051\027\054\030\052\031\047" +
    "\001\002\000\004\011\071\001\002\000\006\002\ufff7\013" +
    "\ufff7\001\002\000\006\010\023\021\025\001\002\000\014" +
    "\004\030\005\027\006\032\007\031\012\074\001\002\000" +
    "\006\010\023\021\025\001\002\000\014\004\030\005\027" +
    "\006\032\007\031\012\076\001\002\000\006\010\023\021" +
    "\025\001\002\000\014\004\030\005\027\006\032\007\031" +
    "\012\100\001\002\000\006\010\023\021\025\001\002\000" +
    "\014\004\030\005\027\006\032\007\031\012\102\001\002" +
    "\000\006\010\023\021\025\001\002\000\014\004\030\005" +
    "\027\006\032\007\031\012\104\001\002\000\022\022\055" +
    "\023\046\024\050\025\053\026\051\027\054\030\052\031" +
    "\047\001\002\000\004\011\106\001\002\000\006\002\ufff4" +
    "\013\ufff4\001\002\000\006\010\023\021\025\001\002\000" +
    "\014\004\030\005\027\006\032\007\031\012\111\001\002" +
    "\000\006\010\023\021\025\001\002\000\014\004\030\005" +
    "\027\006\032\007\031\012\113\001\002\000\006\010\023" +
    "\021\025\001\002\000\014\004\030\005\027\006\032\007" +
    "\031\012\115\001\002\000\006\010\023\021\025\001\002" +
    "\000\014\004\030\005\027\006\032\007\031\012\117\001" +
    "\002\000\022\022\055\023\046\024\050\025\053\026\051" +
    "\027\054\030\052\031\047\001\002\000\004\011\121\001" +
    "\002\000\006\002\ufff6\013\ufff6\001\002\000\006\010\023" +
    "\021\025\001\002\000\014\004\030\005\027\006\032\007" +
    "\031\012\124\001\002\000\006\010\023\021\025\001\002" +
    "\000\014\004\030\005\027\006\032\007\031\012\126\001" +
    "\002\000\006\010\023\021\025\001\002\000\014\004\030" +
    "\005\027\006\032\007\031\012\130\001\002\000\022\022" +
    "\055\023\046\024\050\025\053\026\051\027\054\030\052" +
    "\031\047\001\002\000\004\011\132\001\002\000\006\002" +
    "\ufff8\013\ufff8\001\002\000\004\002\001\001\002\000\006" +
    "\002\uffff\013\uffff\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\132\000\006\002\003\003\005\001\001\000\004\003" +
    "\133\001\001\000\016\004\010\005\012\006\015\007\006" +
    "\010\016\011\011\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\012\023\001\001\000\004\012\056\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\012\036" +
    "\001\001\000\004\012\035\001\001\000\004\012\034\001" +
    "\001\000\004\012\033\001\001\000\004\012\032\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\012\040\001\001" +
    "\000\002\001\001\000\004\012\042\001\001\000\002\001" +
    "\001\000\004\013\044\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\012\061\001\001\000\002\001\001" +
    "\000\004\012\063\001\001\000\002\001\001\000\004\012" +
    "\065\001\001\000\002\001\001\000\004\013\067\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\012\072\001" +
    "\001\000\002\001\001\000\004\012\074\001\001\000\002" +
    "\001\001\000\004\012\076\001\001\000\002\001\001\000" +
    "\004\012\100\001\001\000\002\001\001\000\004\012\102" +
    "\001\001\000\002\001\001\000\004\013\104\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\012\107\001\001" +
    "\000\002\001\001\000\004\012\111\001\001\000\002\001" +
    "\001\000\004\012\113\001\001\000\002\001\001\000\004" +
    "\012\115\001\001\000\002\001\001\000\004\013\117\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\012\122" +
    "\001\001\000\002\001\001\000\004\012\124\001\001\000" +
    "\002\001\001\000\004\012\126\001\001\000\002\001\001" +
    "\000\004\013\130\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



	public ArrayList<Shape> shapes = new ArrayList<>();

	public boolean hasUnRecoveredSyntaxError = false;

	public void syntax_error(Symbol cur_token) {
		// System.err.println("syntax_error " + cur_token );
		// nothing to do, just to avoid native syntax_error method.
	}

	public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
		// System.err.println("unrecovered_syntax_error:" + s);
		// nothing to do.
		this.hasUnRecoveredSyntaxError = true;
	}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // EXPR ::= integer 
            {
              Double RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double n = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = n; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXPR",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // EXPR ::= oParen EXPR cParen 
            {
              Double RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = e; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXPR",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // EXPR ::= EXPR division EXPR 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = e1 / e2; /* if e2 === 0. semantic error, the life if to short to worry about it.*/
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXPR",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // EXPR ::= EXPR multiplication EXPR 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = e1 * e2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXPR",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // EXPR ::= EXPR minus EXPR 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = e1 - e2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXPR",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // EXPR ::= EXPR plus EXPR 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = e1 + e2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXPR",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // COLOR ::= black 
            {
              String RESULT =null;
		int blackleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int blackright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String black = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = black; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("COLOR",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // COLOR ::= brown 
            {
              String RESULT =null;
		int brownleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int brownright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String brown = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = brown; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("COLOR",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // COLOR ::= purple 
            {
              String RESULT =null;
		int purpleleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int purpleright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String purple = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = purple; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("COLOR",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // COLOR ::= orange 
            {
              String RESULT =null;
		int orangeleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int orangeright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String orange = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = orange; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("COLOR",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // COLOR ::= yellow 
            {
              String RESULT =null;
		int yellowleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int yellowright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String yellow = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = yellow; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("COLOR",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // COLOR ::= green 
            {
              String RESULT =null;
		int greenleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int greenright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String green = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = green; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("COLOR",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // COLOR ::= red 
            {
              String RESULT =null;
		int redleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int redright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String red = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = red; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("COLOR",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // COLOR ::= blue 
            {
              String RESULT =null;
		int blueleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int blueright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String blue = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = blue; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("COLOR",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // POLYGON ::= polygon oParen EXPR comma EXPR comma EXPR comma EXPR comma EXPR comma COLOR cParen 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-11)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-11)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-11)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-9)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-9)).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-9)).value;
		int e3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).left;
		int e3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).right;
		Double e3 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-7)).value;
		int e4left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int e4right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		Double e4 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int e5left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int e5right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Double e5 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int colorleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int colorright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String color = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
    Shape shape = new Shape();
    shape.setType("polygon");
    shape.setColor(color);
    shape.addValue(e1);
    shape.addValue(e2);
    shape.addValue(e3);
    shape.addValue(e4);
    shape.addValue(e5);
    this.parser.shapes.add(shape);

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("POLYGON",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-13)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // LINE ::= line oParen EXPR comma EXPR comma EXPR comma EXPR comma COLOR cParen 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-9)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-9)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-9)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-7)).value;
		int e3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int e3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		Double e3 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int e4left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int e4right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Double e4 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int colorleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int colorright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String color = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
    Shape shape = new Shape();
    shape.setType("line");
    shape.setColor(color);
    shape.addValue(e1);
    shape.addValue(e2);
    shape.addValue(e3);
    shape.addValue(e4);
    this.parser.shapes.add(shape);

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("LINE",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-11)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // RECTANGLE ::= rectangle oParen EXPR comma EXPR comma EXPR comma EXPR comma COLOR cParen 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-9)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-9)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-9)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-7)).value;
		int e3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int e3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		Double e3 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int e4left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int e4right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Double e4 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int colorleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int colorright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String color = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
    Shape shape = new Shape();
    shape.setType("rectangle");
    shape.setColor(color);
    shape.addValue(e1);
    shape.addValue(e2);
    shape.addValue(e3);
    shape.addValue(e4);
    this.parser.shapes.add(shape);

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("RECTANGLE",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-11)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // SQUARE ::= square oParen EXPR comma EXPR comma EXPR comma COLOR cParen 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-7)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int e3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int e3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Double e3 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int colorleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int colorright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String color = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
    Shape shape = new Shape();
    shape.setType("square");
    shape.setColor(color);
    shape.addValue(e1);
    shape.addValue(e2);
    shape.addValue(e3);
    this.parser.shapes.add(shape);

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("SQUARE",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-9)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // CIRCLE ::= circle oParen EXPR comma EXPR comma EXPR comma COLOR cParen 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-7)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int e3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int e3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Double e3 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int colorleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int colorright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String color = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
    Shape shape = new Shape();
    shape.setType("circle");
    shape.setColor(color);
    shape.addValue(e1);
    shape.addValue(e2);
    shape.addValue(e3);
    this.parser.shapes.add(shape);

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("CIRCLE",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-9)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // IN_COMPONENT ::= POLYGON 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("IN_COMPONENT",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // IN_COMPONENT ::= LINE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("IN_COMPONENT",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // IN_COMPONENT ::= RECTANGLE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("IN_COMPONENT",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // IN_COMPONENT ::= SQUARE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("IN_COMPONENT",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // IN_COMPONENT ::= CIRCLE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("IN_COMPONENT",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // COMPONENT ::= graph IN_COMPONENT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("COMPONENT",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // COMPONENTS ::= COMPONENTS COMPONENT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("COMPONENTS",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // COMPONENTS ::= COMPONENT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("COMPONENTS",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= COMPONENTS EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

