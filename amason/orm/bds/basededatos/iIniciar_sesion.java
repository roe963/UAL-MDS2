package basededatos;

public interface iIniciar_sesion {

	public Usuario iniciar_sesion(String aMailUsuario, String aPasswordUsuario);

	public boolean recuperar_contrasena(String aMailUsuario);
}