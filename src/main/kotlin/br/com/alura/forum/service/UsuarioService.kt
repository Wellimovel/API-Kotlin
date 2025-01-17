package br.com.alura.forum.service


import br.com.alura.forum.model.Usuario
import br.com.alura.forum.repository.UsuarioRepository
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service


@Service
class UsuarioService (private val repository: UsuarioRepository) :UserDetailsService {

    fun buscarPorId(id: Long): Usuario {
        return repository.getOne(id)
    }

    override fun loadUserByUsername(p0: String?): UserDetails {
        val username =null
        val usuario = repository.findByEmail(username)?: throw RuntimeException()
        return UserDetail(usuario)

    }
}
