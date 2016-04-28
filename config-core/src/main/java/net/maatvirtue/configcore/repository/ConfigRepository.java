package net.maatvirtue.configcore.repository;

import net.maatvirtue.configcore.entity.ConfigEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigRepository extends JpaRepository<ConfigEntity, Integer>
{
	ConfigEntity findByKey(String key);
}
