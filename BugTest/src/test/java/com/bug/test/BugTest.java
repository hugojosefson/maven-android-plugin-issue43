package com.bug.test;

import com.bug.Bug;
import com.bug.Common;

import android.test.AndroidTestCase;

public class BugTest extends AndroidTestCase {
	
	public void testBug () {
		@SuppressWarnings("unused")
		int bar2 = Common.Foo;
		bar2 = Bug.Bar;
	}
}
