/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Modelos.Documento;
import Modelos.*;
import clases.TSBHashtable;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 *
 * @author joel
 */
@ApplicationScoped
public class GestorBusqueda {
    
    @PersistenceContext(unitName="PUBuscador")
    private EntityManager em2;
    private Posteo posteo;
    
    
    public List<Documento> buscar(String query){
        return null;
    }
    
    
    
    public Documento getDocumento(int idDocumento)
    {      
        
        return null;
    }
    
    @Transactional
    public boolean CargarArchivos ()
    {
        boolean ret=false;
         int c=0;
        File f = new File("D:\\descazrgas\\4 ano\\DCL\\DocumentosTP1-20210506T042112Z-001\\DocumentosTP1");
        //em2.createNativeQuery("hola");
        TSBHashtable vocabularioLocal=new TSBHashtable();
        Stream.of(f.listFiles((arch, nom)-> nom.endsWith(".txt"))).filter(p -> p.isFile() && !p.isHidden()).forEach(res -> {

                try {
                    System.out.println(res.getPath());
                    Scanner sc = new Scanner((new BufferedReader(new FileReader(res.getPath()))));
                    sc.useDelimiter("[^a-zA-Z]");
                    while(sc.hasNext())
                    {
                        
                        String palabra=sc.next();
                        if(!palabra.isBlank())
                        {
                            palabra=palabra.toLowerCase();
                            if(!vocabularioLocal.containsValue(palabra))   
                            {
                                
                                vocabularioLocal.put(palabra.hashCode(), palabra);
                                
                                Vocabulario vocabulario= new Vocabulario();
                                
                                vocabulario.setMaxFrecuencia(1);
                                vocabulario.setCantDocumentos(1);
                                vocabulario.setPalabra(palabra);
                                //System.out.println(vocabulario.toString());
                                
                                //em2.persist(vocabulario);
                                
                                em2.persist(vocabulario);
                               
                                //System.out.println(res.getName());
                                
                                /*vocabulario=new Vocabulario();
                                vocabulario.setCantDocumentos(1);
                                vocabulario.setMaxFrecuencia(1);
                                vocabulario.setPalabra(palabra);
                                posteo= new Posteo();
                                posteo.setFrecuencia(1);
                                //posteo.setIdDocumento(res.getName());
                                posteo.setPalabra(palabra);  */
                                
                                //em2.persist(vocabulario);
                                //em2.persist(posteo);
                                
                            }
                            else
                            {
                                /*System.out.println("palabra rep:" + palabra);
                                System.out.println("Documento:"+res.getName());
                                /*
                                vocabulario=new Vocabulario();
                                vocabulario=em2.find(Vocabulario.class, palabra);
                                vocabulario.getCantDocumentos();
                                vocabulario.getPalabra();
                                vocabulario.getMaxFrecuencia();
                                vocabulario.setCantDocumentos(1);
                                vocabulario.setMaxFrecuencia(1);
                                vocabulario.setPalabra(palabra);
                                */
                                /*posteo= new Posteo();
                                posteo=em2.find(Posteo.class, palabra);
                                posteo.getFrecuencia();
                                posteo.getIdDocumento();
                                posteo.getPalabra();
                                */
                                
                            }
                            //em2.createNativeQuery("");
                            //vocabulario.put(palabra.hashCode(), palabra.toLowerCase());
                            // em2.createNativeQuery(palabra);
                            
                        }
                        
                        
                    }
                    
                } catch (FileNotFoundException ex) {
                    System.out.println("Error de carga");
                    
                }                
                //System.out.println(vocabulario.toString());
            
        });
       
        System.out.println(vocabularioLocal.toString());
        return ret;
    }
    
    
}
