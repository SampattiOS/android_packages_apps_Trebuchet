/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.launcher3.celllayout.testcases;

import android.graphics.Point;

import java.util.Map;

public class FullReorderCase {
    private static final String START_BOARD_STR_5x5 = ""
            + "xxxxx\n"
            + "222mm\n"
            + "222mm\n"
            + "ad111\n"
            + "bc111";

    private static final Point MOVE_TO_5x5 = new Point(0, 4);

    private static final String END_BOARD_STR_5x5 = ""
            + "xxxxx\n"
            + "222ad\n"
            + "222bc\n"
            + "mm111\n"
            + "mm111";

    private static final ReorderTestCase TEST_CASE_5x5 = new ReorderTestCase(START_BOARD_STR_5x5,
            MOVE_TO_5x5,
            END_BOARD_STR_5x5);

    private static final String START_BOARD_STR_6x5 = ""
            + "xxxxxx\n"
            + "2222mm\n"
            + "2222mm\n"
            + "ad1111\n"
            + "bc1111";

    private static final Point MOVE_TO_6x5 = new Point(0, 4);

    private static final String END_BOARD_STR_6x5 = ""
            + "xxxxxx\n"
            + "2222ad\n"
            + "2222bc\n"
            + "mm1111\n"
            + "mm1111";

    private static final ReorderTestCase TEST_CASE_6x5 = new ReorderTestCase(START_BOARD_STR_6x5,
            MOVE_TO_6x5,
            END_BOARD_STR_6x5);

    public static final Map<Point, ReorderTestCase> TEST_BY_GRID_SIZE =
            Map.of(new Point(5, 5), TEST_CASE_5x5, new Point(6, 5), TEST_CASE_6x5);
}