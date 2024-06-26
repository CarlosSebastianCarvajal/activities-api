
package com.api.serviceinterface;

import com.api.models.Cumplimiento;
import com.github.cliftonlabs.json_simple.JsonObject;
import java.util.List;
/**
 *
 * @author Sebastian Carvajal
 */
public interface ICumplimientoService {
    //Principales
    public List<Cumplimiento> ListarTodo();
    
    public Cumplimiento BuscarPorId(Long id);
	
    public Cumplimiento Guardar(Cumplimiento cumplimiento);
    
    public Cumplimiento Actualizar(Cumplimiento cumplimiento);
	
    public void EliminarPorId(Long id);  
    
    //Secundarios
    public JsonObject CumplirActividad(Cumplimiento cumplimientoReq);
}
