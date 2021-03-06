/*
 * This file is part of the swblocks-decisiontree library.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.swblocks.decisiontree.tree;

import org.swblocks.jbl.util.DateRange;

/**
 * Driver holding a {@link DateRange}.
 */
public class DateRangeDriver extends InputDriver {
    public static final String DR_PREFIX = "DR";

    public DateRangeDriver(String name, DateRange range) {
        super(name, InputValueType.DATE_RANGE, new DateRangeEvaluation(name, range));
    }
}
