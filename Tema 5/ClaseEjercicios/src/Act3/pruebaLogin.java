package Act3;

public class pruebaLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestorLogin gestor=new GestorLogin();
		gestor.añadirUsuario("asdasd", "Aaaaa123");
		gestor.añadirUsuario("qweqwe", "bbbbB123");
		gestor.añadirUsuario("zxczxc", "123Ccccc");
		gestor.añadirUsuario("mnbmnb", "123ddddD");
		
		gestor.mostrarUsuarios();
		
		System.out.println("uusario :asdasd contraseña :Aaaaa123");
		gestor.logearse("asdasd", "Aaaaa123");
		
		System.out.println("uusario :asd contraseña :Aaaaa123");
		gestor.logearse("asd", "Aaaaa123");
		System.out.println("uusario :asd34asd contraseña :Aaaaa123");
		gestor.logearse("asd34asd", "Aaaaa123");
		System.out.println("uusario :asdasd contraseña :aaaaa123");
		gestor.logearse("asdasd", "aaaaa123");
		System.out.println("uusario :asdasd contraseña :Aaaaaqwe");
		gestor.logearse("asdasd", "Aaaaaqwe");
		System.out.println("uusario :xxxxxx contraseña :Aaaaaqwe");
		gestor.logearse("xxxxxx", "Aaaaa123");
	}

}
