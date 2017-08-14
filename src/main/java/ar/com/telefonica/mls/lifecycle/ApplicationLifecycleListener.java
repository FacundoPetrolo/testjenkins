package ar.com.telefonica.mls.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import ar.com.telefonica.mls.service.ApplicationLifecycleService;

@Component
public class ApplicationLifecycleListener implements ApplicationListener<ApplicationContextEvent>
{
	public void onApplicationEvent(ApplicationContextEvent event)
	{
		if (event instanceof ContextRefreshedEvent)
		{
			ApplicationContext context = (ApplicationContext)event.getSource();
			ApplicationLifecycleService applicationInitializationService = context.getBean(ApplicationLifecycleService.class);
			applicationInitializationService.onContextInitialized();
		}
		if (event instanceof ContextClosedEvent)
		{
			ApplicationContext context = (ApplicationContext)event.getSource();
			ApplicationLifecycleService applicationInitializationService = context.getBean(ApplicationLifecycleService.class);
			applicationInitializationService.onContextClosed();
		}
	}
}
