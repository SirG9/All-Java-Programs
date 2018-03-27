package com.chicho.hybris.cronjob;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.chevron.gd.cbp.marine.service.CBPMarineLCIntegrationService;

import de.hybris.cronjob.model.LubeChartIntegrationCronJobModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

public class LubeChartIntegrationJob extends AbstractJobPerformable<LubeChartIntegrationCronJobModel>{

	@Resource(name="cbpMarineLCIntegrationService")
	CBPMarineLCIntegrationService cbpMarineLCIntegrationService;
	
	private static final Logger LOG = Logger.getLogger(LubeChartIntegrationJob.class);
	@Override
	public PerformResult perform(LubeChartIntegrationCronJobModel lubeChartIntJob) {
		// TODO Auto-generated method stub
		
		CatalogVersionModel catVer = lubeChartIntJob.getCatalogVersion();
		
		String Response = cbpMarineLCIntegrationService.processRestRequest(catVer);
		
		if(Response.equals("Success"))
			return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
		else
			return new PerformResult(CronJobResult.ERROR, CronJobStatus.FINISHED);
	}
}
