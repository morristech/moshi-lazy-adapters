/*
 * Copyright 2016 Serj Lotutovici
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
package com.serjltt.moshi.adapters;

import com.squareup.moshi.JsonQualifier;
import com.squareup.moshi.Moshi;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Indicates that the annotated type/field should be serialized as {@code null} in case of a
 * empty/null value.
 *
 * <p>To leverage from {@linkplain SerializeNulls} the {@linkplain
 * SerializeNullsJsonAdapter#FACTORY} must be added  to a {@linkplain Moshi Moshi instance}:
 *
 * <pre><code>
 *   Moshi moshi = new Moshi.Builder()
 *      .add(SerializeNullsJsonAdapter.FACTORY)
 *      .build();
 * </code></pre>
 */
@Documented
@JsonQualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface SerializeNulls {
}
