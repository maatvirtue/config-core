package net.maatvirtue.configcore.webservice.impl;

import net.maatvirtue.configcore.api.dto.Config;
import net.maatvirtue.configcore.api.webservice.ConfigWebService;
import net.maatvirtue.configcore.entity.ConfigEntity;
import net.maatvirtue.configcore.repository.ConfigRepository;
import net.maatvirtue.wsutils.restexception.exception.NotFoundRestException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

@Service
@Transactional
public class ConfigWebServiceImpl implements ConfigWebService
{
	@Inject
	private ConfigRepository configRepository;

	@Override
	public Config getConfig(String configKey) throws NotFoundRestException
	{
		ConfigEntity config = configRepository.findByKey(configKey);

		if(config == null)
			throw new NotFoundRestException("Config with config key \"" + configKey + "\" not found.");

		return new Config(config.getKey(), config.getValue());
	}
}
