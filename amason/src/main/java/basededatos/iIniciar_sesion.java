package basededatos;

public interface iIniciar_sesion {

	public Usuario iniciar_sesion(String aMailUsuario, String aPasswordUsuario);

	public String recuperar_contrasena(String aMailUsuario);
}