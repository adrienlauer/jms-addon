/**
 * Copyright (c) 2013-2016, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.jms.internal;

import org.apache.commons.configuration.BaseConfiguration;
import org.seedstack.jms.spi.ConnectionDefinition;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.naming.Context;
import java.util.HashMap;

/**
 * @author pierre.thirouin@ext.mpsa.com
 */
public class FakeConnectionFactoryImpl extends JmsFactoryImpl {
    public FakeConnectionFactoryImpl() {
        super("test", new BaseConfiguration(), new HashMap<String, Context>());
    }

    @Override
    public Connection createRawConnection(ConnectionDefinition connectionDefinition) throws JMSException {
        throw new IllegalStateException("Connection is closed");
    }
}
