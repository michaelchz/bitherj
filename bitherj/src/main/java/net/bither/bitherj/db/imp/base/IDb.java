/*
 * Copyright 2014 http://Bither.net
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.bither.bitherj.db.imp.base;

import com.google.common.base.Function;

public interface IDb {
    void beginTransaction();
    void endTransaction();
    void close();

    @Deprecated
    void execUpdate(String sql, String[] params);
    @Deprecated
    void execQueryOneRecord(String sql, String[] params, Function<ICursor, Void> func);
    @Deprecated
    void execQueryLoop(String sql, String[] params, Function<ICursor, Void> func);

    void execUpdate(String sql, Object[] params);
    void execQueryOneRecord(String sql, Object[] params, Function<ICursor, Void> func);
    void execQueryLoop(String sql, Object[] params, Function<ICursor, Void> func);
}
