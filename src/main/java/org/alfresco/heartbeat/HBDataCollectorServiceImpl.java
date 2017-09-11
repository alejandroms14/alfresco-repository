/*
 * #%L
 * Alfresco Repository
 * %%
 * Copyright (C) 2005 - 2017 Alfresco Software Limited
 * %%
 * This file is part of the Alfresco software. 
 * If the software was purchased under a paid Alfresco license, the terms of 
 * the paid license agreement will prevail.  Otherwise, the software is 
 * provided under the following open source license terms:
 * 
 * Alfresco is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Alfresco is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Alfresco. If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */
package org.alfresco.heartbeat;

import java.util.LinkedList;
import java.util.List;

import org.alfresco.service.cmr.repository.HBDataCollectorService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;

public class HBDataCollectorServiceImpl implements HBDataCollectorService
{

    /** The logger. */
    private static final Log logger = LogFactory.getLog(HBDataCollectorServiceImpl.class);

    private List<HBBaseDataCollector> collectors = new LinkedList<>();
//    private HBDataSenderService dataSender;
    private boolean enabled;


    @Override
    public void registerCollector(HBBaseDataCollector collector)
    {
        this.collectors.add(collector);
    }

    @Override
    public void collectAndSendData()
    {
        for (HBBaseDataCollector collector : collectors)
        {

            List<HBData> data = collector.collectData();

//            try
//            {
//                dataSender.sendData(data);
//            }
//            catch (Exception e)
//            {
//                // log exception;
//            }
        }
    }

    @Override
    public boolean isHBEnabled()
    {
        return enabled;
    }

}