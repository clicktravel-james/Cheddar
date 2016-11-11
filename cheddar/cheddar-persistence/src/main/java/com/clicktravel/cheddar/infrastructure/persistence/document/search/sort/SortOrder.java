/*
 * Copyright 2014 Click Travel Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.clicktravel.cheddar.infrastructure.persistence.document.search.sort;

import java.util.ArrayList;
import java.util.List;

public class SortOrder {

    private final List<SortingOption> sortingOptions = new ArrayList<SortingOption>();

    public static final SortOrder DEFAULT = new SortOrder();

    public void addSortingOption(final SortingOption sortingOption) {
        sortingOptions.add(sortingOption);
    }

    public List<SortingOption> sortingOptions() {
        return sortingOptions;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + sortingOptions.hashCode();
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SortOrder other = (SortOrder) obj;
        if (!sortingOptions.equals(other.sortingOptions)) {
            return false;
        }
        return true;
    }
}
