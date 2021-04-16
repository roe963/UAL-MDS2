package basededatos;

public interface iIniciar_sesión {

	public Usuario iniciar_sesion(String aMailUsuario, String aPasswordUsuario, String aConfirmPasswordUsuario);

	public String recuperarContrasena(String aMailUsuario);
}