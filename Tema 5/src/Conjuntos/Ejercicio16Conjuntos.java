package Conjuntos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio16Conjuntos {

	public static void main(String[] args) {
		String cadena = "alegria jirafa humo hipoteca vinculo ambicion tocino ensayo lente plato pizarra turismo montana reloj jarra pierna caoba lince balcon musica plato alivio cieno bulto querer ano chispa vino cable piloto zafiro jaula queso sombra arana hielo hacha encia gafas colina radio fallo jarabe pez menta almena abeto llanto huevo barco pluma faro gorra hoja azote espejo silla yate huella nieve amparo circulo vuelo jamon rey duque chico plato cuadro pato lanza yerno mango zanja piel viento barra cueva hombro nube anillo limite reina viaje cesto valle uva bravo puno plano bosque rata suerte esquina nariz jazmin purpura llama foco nexo doble ruta oro horno carcel toque limon balon silueta pupila exceso silla sena timo encaje plato gancho balsa ola trece lodo rama grasa vaina marco narro foto chino calle arbol giro caja bomba mesa cuna capa pina numero grito leon cielo rana bache zorro zona olmo angel plato junta falda musica ola alga broma papa parra buho prisa bravo nino buho zumba cuadra hacha seda plomo pasion brote cruz mazo jardin juez purpura luna quiso jarra duna eco gente magia sueno dedo llama grano rueda jirafa cuadra panza vaso mecha silla lomo mascara gente bache raza barca medico uva cruz peso jirafa calvo duque broma red lazo plato sombra plato calvo beso traqueotomia radio halcon llanto foro pajaro caer dia queso oro escoba chico plato rata fama jarra duna alegria jirafa humo hipoteca vinculo ambicion tocino ensayo lente plato pizarra turismo montana reloj jarra pierna caoba lince balcon musica plato alivio cieno bulto querer ano chispa vino cable piloto zafiro jaula queso sombra arana hielo hacha encia gafas colina radio fallo jarabe pez menta almena abeto llanto huevo barco pluma faro gorra hoja azote espejo silla yate huella nieve amparo circulo vuelo jamon rey duque chico plato cuadro pato lanza yerno mango zanja piel viento barra cueva hombro nube anillo limite reina viaje cesto valle uva bravo puno plano bosque rata suerte esquina nariz jazmin purpura llama foco nexo doble ruta oro horno carcel toque limon balon silueta pupila exceso silla sena timo encaje plato gancho balsa ola trece lodo rama grasa vaina marco narro foto chino calle arbol giro caja bomba mesa cuna capa pina numero grito leon cielo rana bache zorro zona olmo angel plato junta falda musica ola alga broma papa parra buho prisa bravo nino buho zumba cuadra hacha seda plomo pasion brote cruz mazo jardin juez purpura luna quiso jarra duna eco gente magia sueno dedo llama grano rueda jirafa cuadra panza vaso mecha silla lomo mascara gente bache raza barca medico uva cruz peso jirafa calvo duque broma red lazo plato sombra plato calvo beso traqueotomia radio halcon llanto foro pajaro caer dia queso oro escoba chico plato rata fama jarra duna";
	
		System.out.println(cadenaPalabras(palabras(cadena)));
		Set<String> sinOrdenar = new HashSet<String>(cadenaPalabras(palabras(cadena)));
		System.out.println(sinOrdenar);
		Set<String> ordenado = new TreeSet<String>(cadenaPalabras(palabras(cadena)));
		System.out.println(ordenado);
		
	}

	public static String[] palabras(String cadena){
		String [] palabras = cadena.split(" ");	
		return palabras;
	}
	public static List<String> cadenaPalabras(String [] cadena) {
		List<String> cadenaPalabras = Arrays.asList(cadena);
		return cadenaPalabras;
	}
}
