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
package com.clicktravel.cheddar.infrastructure.persistence.document.search.query;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.clicktravel.common.random.Randoms;

public class SimpleQueryTest {

    @Test
    public void shouldBeSimpleQuery() {
        final SimpleQuery query = new SimpleQuery(Randoms.randomString());
        assertEquals(QueryType.SIMPLE, query.queryType());
    }

    @Test
    public void shouldBeEqual_withSameValues() {
        // Given
        final String query = Randoms.randomString();
        final SimpleQuery luceneQuery = new SimpleQuery(query);
        final SimpleQuery otherLuceneQuery = new SimpleQuery(query);

        // When
        final boolean equals = luceneQuery.equals(otherLuceneQuery);

        // Then
        assertTrue(equals);
    }

}
