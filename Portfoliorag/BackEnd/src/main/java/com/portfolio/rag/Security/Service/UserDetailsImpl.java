package com.portfolio.rag.Security.Service;

import com.portfolio.rag.Security.Entity.Usuario;
import com.portfolio.rag.Security.Entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Augusto
 */
@Service
public class UserDetailsImpl implements UserDetailsService{
   @Autowired   
  UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
       Usuario usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();
       return UsuarioPrincipal.build(usuario);
    }
}
