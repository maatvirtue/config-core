package net.maatvirtue.configcore.api.webservice;

import net.maatvirtue.configcore.api.dto.Config;
import net.maatvirtue.wsutils.restexception.exception.NotFoundRestException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/config")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface ConfigWebService
{
	@GET
	@Path("/{configKey}")
	Config getConfig(@PathParam("configKey") String configKey) throws NotFoundRestException;
}
