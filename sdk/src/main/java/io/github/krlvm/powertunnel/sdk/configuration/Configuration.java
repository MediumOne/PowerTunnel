/*
 * This file is part of PowerTunnel.
 *
 * PowerTunnel is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PowerTunnel is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with PowerTunnel.  If not, see <https://www.gnu.org/licenses/>.
 */

package io.github.krlvm.powertunnel.sdk.configuration;

import java.util.Collection;

public interface Configuration {

    String get(String key, String defaultValue);
    void set(String key, String value);

    int getInt(String key, int defaultValue);
    void setInt(String key, int value);

    boolean getBoolean(String key, boolean defaultValue);
    void setBoolean(String key, boolean value);

    boolean contains(String key);
    void remove(String key);

    Collection<String> keys();
    void clear();
}
