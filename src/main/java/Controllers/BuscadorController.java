/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Gestores.GestorBusqueda;
import Modelos.Documento;
import java.io.File;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author joel
 */
@Path("/api")
public class BuscadorController {
    
    @Inject GestorBusqueda gestorBusqueda;   
     
    @Path("/buscar/{arrayBusqueda}")
    @GET
    public Response Buscar(@PathParam("arrayBusqueda") String arrayBusqueda)//principal
    {
        //List<Documento> resultado= gestorBusqueda.buscar("mi string");
        return Response.ok("buscar").build();
    }
    
    @Path("/agregar/{ruta}")
    @GET
    public Response Agregar(@PathParam("ruta") String ruta)//principal
    {
        //List<Documento> resultado= gestorBusqueda.buscar("mi string");
        return Response.ok("agregar").build();
    }
    @Path("/{id}")
    @GET
    public Response Traer(@PathParam("id") int id)
    {
        //List<Documento> resultado= gestorBusqueda.buscar("mi string");
        return Response.ok("Traer").build();
    }
    
    @Path("/cargarArchivos")
    @GET    
    public Response CargarPalabras()
    {
        
        
       gestorBusqueda.CargarArchivos();
        return Response.ok("cargarArchivos").build();
    }
    
    @Path("/pruebas")
    @PUT    
    @Consumes(MediaType.APPLICATION_JSON)
    public Response Pruebas(Object miObjeto)
    {
        
        //List<Documento> resultado= gestorBusqueda.buscar("mi string");
        return Response.ok("cargarArchivos").build();
    }
    
}

