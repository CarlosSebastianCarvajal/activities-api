
package com.api.controllers;

import com.api.models.Integrante;
import com.api.serviceinterface.IIntegranteService;
import com.github.cliftonlabs.json_simple.JsonObject;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sebastian Carvajal
 */
@RestController
public class IntegranteController {
    @Autowired
    private IIntegranteService iIntegranteService;
    
    @PostMapping("/listarIntegrante")
    public List<Integrante> listar(){
    	return iIntegranteService.ListarTodo();
    }
    
    @PostMapping("/verIntegrante/{id}")
    public Integrante listarPorId(@PathVariable Long id){
    	return iIntegranteService.BuscarPorId(id);
    }
    
    @PostMapping("/crearIntegrante")
    @ResponseStatus(HttpStatus.CREATED)
    public Integrante nuevo(@RequestBody Integrante integrante){
    	return iIntegranteService.GuardarActualizar(integrante);
    }
    
    @PostMapping("/editarIntegrante")
    @ResponseStatus(HttpStatus.CREATED)
    public Integrante editar(@RequestBody Integrante integrante){
        return iIntegranteService.GuardarActualizar(integrante);
    }
    
    @PostMapping("/eliminarIntegrante/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id) {
        iIntegranteService.EliminarPorId(id);
    }
    
    @PostMapping("/verIntegrantesPorIdEquipo/{idEquipo}")
    public JsonObject VerIntegrantesPorIdEquipo(@PathVariable Long idEquipo){
    	return iIntegranteService.VerIntegrantesPorIdEquipo(idEquipo);
    }
    
    @PostMapping("/agregarIntegrantes")
    @ResponseStatus(HttpStatus.CREATED)
    public JsonObject AgregarIntegrantes(@RequestBody List<Integrante> listaIntegrantes){
    	return iIntegranteService.AgregarIntegrantes(listaIntegrantes);
    }
    
    @PostMapping("/quitarIntegrante/{idIntegrante}")
    public JsonObject quitarIntegrante(@PathVariable Long idIntegrante){
    	return iIntegranteService.QuitarIntegrante(idIntegrante);
    }
}
