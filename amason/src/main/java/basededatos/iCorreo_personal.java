package basededatos;

public interface iCorreo_personal {

	public Mensaje[] cargar_mensajes_cliente(int aIdUsuario);

	public void redactar_mensaje(int aIdUsuario, String aMensajeUsuario);

	public void ver_mensaje(int aIdMensaje);

	public Respuesta[] cargar_respuestas_mensaje(int aIdMensaje);

	public void responder_respuesta(int aIdMensaje, String aRespuesta);

	public Mensaje[] cargar_mensajes_administrador();
}