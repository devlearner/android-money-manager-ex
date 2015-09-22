/*
 * Copyright (C) 2012-2015 The Android Money Manager Ex Project Team
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.moneymanagerex.android.tests;

import android.test.mock.MockContext;

import com.money.manager.ex.core.NumericHelper;

import junit.framework.TestCase;

/**
 * First unit test.
 * Created by Alen Siljak on 11/08/2015.
 */
public class NumericHelperTest
        extends TestCase {

    private NumericHelper _numericHelper;

    public void setUp() throws Exception {
        super.setUp();

        MockContext context = new MockContext();
        _numericHelper = new NumericHelper(context);

    }

    public void tearDown() throws Exception {
        _numericHelper = null;
    }

    public void testIsNumeric() throws Exception {
        boolean actual = NumericHelper.isNumeric("3");
        assertTrue(actual);
    }

    public void testTryParse() throws Exception {
        int actual = _numericHelper.tryParse("64");
        assertEquals(64, actual);
    }

    public void testGetNumberFormatted() throws Exception {

    }

    public void testGetNumberDecimal() throws Exception {

    }
}