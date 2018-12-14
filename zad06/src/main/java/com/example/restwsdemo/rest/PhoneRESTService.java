package com.example.restwsdemo.rest;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.restwsdemo.domain.Phone;
import com.example.restwsdemo.service.PhoneManager;

@Path("phone")
@Stateless
public class PhoneRESTService {

	@Inject
	private PhoneManager bm;

	@GET
	@Path("/{phoneId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Phone getPhone(@PathParam("phoneId") Integer id) {
		Phone b = bm.getPhone(id);
		return b;
	}

	@GET
	@Path("/allPhones")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Phone> getPhones() {
		return bm.getAllPhones();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addPhone(@QueryParam("producer") String producer, @QueryParam("price") double price) {
		Phone phone = new Phone(producer, price);
		bm.addPhone(phone);

		return Response.status(201).entity("Phone").build();
	}
	
	@PUT
	@Path("/{phoneId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updatePhone(@PathParam("phoneId") Integer id, @QueryParam("producer") String producer, @QueryParam("price") double price) {
		bm.updatePhone(id, producer, price);
		return Response.status(200).build();
	}
	
	@DELETE
	@Path("/{phoneId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updatePhone(@PathParam("phoneId") Integer id) {
		bm.deletePhone(bm.getPhone(id));
		return Response.status(200).build();
	}

	@DELETE
	@Path("/deleteAll")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response clearPhones() {
		bm.deleteAllPhones();
		return Response.status(200).build();
	}

}
