/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.workbench.screens.domaineditor.client.handlers.planner;

import javax.enterprise.context.ApplicationScoped;

import org.jboss.errai.ioc.client.container.IOC;
import org.kie.workbench.common.screens.datamodeller.client.command.DataModelCommand;
import org.kie.workbench.common.screens.datamodeller.client.handlers.DomainHandler;
import org.kie.workbench.common.screens.datamodeller.client.widgets.common.domain.DomainEditor;
import org.kie.workbench.common.screens.datamodeller.client.widgets.common.domain.ResourceOptions;
import org.optaplanner.workbench.screens.domaineditor.client.widgets.planner.PlannerDomainEditor;

@ApplicationScoped
public class PlannerDomainHandler implements DomainHandler {

    public PlannerDomainHandler() {
    }

    @Override
    public String getName() {
        return "PLANNER";
    }

    @Override
    public int getPriority() {
        return 5;
    }

    @Override
    public DomainEditor getDomainEditor( boolean newInstance ) {
        PlannerDomainEditor domainEditor = IOC.getBeanManager().lookupBean( PlannerDomainEditor.class ).newInstance();
        domainEditor.setHandler( this );
        return domainEditor;
    }

    @Override
    public ResourceOptions getResourceOptions( boolean newInstance ) {
        //not apply for this domain.
        return null;
    }

    @Override
    public boolean validateCommand( DataModelCommand command ) {
        return true;
    }

    @Override
    public void postCommandProcessing( DataModelCommand command ) {
        //not apply for this domain.
    }
}
