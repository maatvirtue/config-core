package net.maatvirtue.configcore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="config")
public class ConfigEntity
{
	@Id
	@GeneratedValue
	private int configId;

	private String key;

	private String value;

	public int getConfigId()
	{
		return configId;
	}

	public void setConfigId(int configId)
	{
		this.configId = configId;
	}

	public String getKey()
	{
		return key;
	}

	public void setKey(String key)
	{
		this.key = key;
	}

	public String getValue()
	{
		return value;
	}

	public void setValue(String value)
	{
		this.value = value;
	}
}
