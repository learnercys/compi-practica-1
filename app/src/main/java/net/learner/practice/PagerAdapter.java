package net.learner.practice;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * @author learnercys on 16/08/15.
 */
public class PagerAdapter extends FragmentPagerAdapter {
    FragmentEditor fragmentEditor = new FragmentEditor();
    FragmentCanvas fragmentCanvas = new FragmentCanvas();

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return fragmentEditor;

            case 1:
                return fragmentCanvas;

            default:
                break;

        }

        // something really unusual happened.
        return null;
    }

    @Override
    public int getCount() {
        // static, I'm a kid, I know
        return 2;
    }
}
