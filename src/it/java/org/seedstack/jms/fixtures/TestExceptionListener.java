/**
 * Copyright (c) 2013-2016, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.jms.fixtures;

import javax.jms.JMSException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Dummy exceptionListener for tests
 *
 * @author redouane.loulou@ext.mpsa.com
 */
public class TestExceptionListener implements javax.jms.ExceptionListener {
    static AtomicInteger count = new AtomicInteger();

    @Override
    public void onException(JMSException exception) {
        count.incrementAndGet();
    }

}
