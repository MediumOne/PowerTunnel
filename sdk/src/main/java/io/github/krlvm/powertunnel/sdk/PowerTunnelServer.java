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

package io.github.krlvm.powertunnel.sdk;

import io.github.krlvm.powertunnel.sdk.configuration.Configuration;
import io.github.krlvm.powertunnel.sdk.exceptions.ProxyStartException;
import io.github.krlvm.powertunnel.sdk.plugin.PowerTunnelPlugin;
import io.github.krlvm.powertunnel.sdk.proxy.ProxyListener;
import io.github.krlvm.powertunnel.sdk.proxy.ProxyServer;
import io.github.krlvm.powertunnel.sdk.proxy.ProxyStatus;
import org.jetbrains.annotations.NotNull;

import java.io.File;

public interface PowerTunnelServer {

    /**
     * Starts proxy server
     * @throws ProxyStartException if proxy server failed to start
     */
    void start() throws ProxyStartException;

    /**
     * Stops proxy server
     */
    void stop();

    /**
     * Check whether proxy server is running
     *
     * @return whether proxy server is currently running
     */
    boolean isRunning();

    /**
     * Returns proxy server status
     *
     * @return proxy server status
     */
    @NotNull ProxyStatus getStatus();

    /**
     * Registers proxy server listener
     *
     * @param plugin registrant plugin
     * @param listener proxy server listener
     * @return ID of registered listener
     */
    int registerProxyListener(@NotNull PowerTunnelPlugin plugin, @NotNull ProxyListener listener);

    /**
     * Registers proxy server listener
     *
     * @param plugin registrant plugin
     * @param listener proxy server listeners
     * @param priority proxy server listener priority
     * @return ID of registered listener
     */
    int registerProxyListener(@NotNull PowerTunnelPlugin plugin, @NotNull ProxyListener listener, int priority);

    /**
     * Unregisters proxy server listener
     * with given ID
     *
     * @param id proxy server listener ID
     */
    void unregisterProxyListener(int id);

    /**
     * Reads configuration and returns the store
     *
     * @param file configuration file
     * @return configuration store
     */
    Configuration readConfiguration(@NotNull File file);

    /**
     * Returns proxy server
     * If proxy server was not created, returns null
     *
     * @return proxy server
     */
    ProxyServer getProxyServer();
}
