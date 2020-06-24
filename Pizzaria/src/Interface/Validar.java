package Interface;

import com.company.models.Usuario;

public interface Validar {
    abstract public boolean validarSenha(Usuario usuario, String senha);
}
