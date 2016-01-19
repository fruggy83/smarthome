/**
 * Copyright (c) 1997, 2015 by ProSyst Software GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.automation.java.api.demo.handler;

import java.util.Map;

import org.eclipse.smarthome.automation.Trigger;
import org.eclipse.smarthome.automation.handler.BaseModuleHandler;
import org.eclipse.smarthome.automation.handler.RuleEngineCallback;
import org.eclipse.smarthome.automation.handler.TriggerHandler;

/**
 * This class serves to handle the Trigger types provided by this application. It is used to notify the RuleEngine about
 * firing the {@link Trigger}s.
 *
 * @author Ana Dimova - Initial Contribution
 *
 */
public class WelcomeHomeTriggerHandler extends BaseModuleHandler<Trigger>implements TriggerHandler {

    private RuleEngineCallback callback;

    public WelcomeHomeTriggerHandler(Trigger module) {
        super(module);
    }

    @Override
    public void setRuleEngineCallback(RuleEngineCallback ruleCallback) {
        callback = ruleCallback;
    }

    /**
     * This method is used to notify the RuleEngine about firing the {@link Trigger}s.
     *
     * @param context
     *            is used to provide the output of the {@link Trigger}.
     */
    public void trigger(Map<String, ?> context) {
        callback.triggered(module, context);
    }

}
