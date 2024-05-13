#pragma once
#include <string>
#include "sexo.h"
#include <iostream>
using namespace std;

class Persona {
	public:
		string nombre;
		int numero;
		Sexo sexo;

		/*
		* Constructor parametrizado
		*/
		Persona(string newNombre, int newNum, string newSexo) {
			nombre = newNombre;
			numero = newNum;
			sexo = comprobarSexo(newSexo);
		}

		/*
		* Metodo que comprueba el sexo introducido y devuelve la enumeracion pertinente
		* @param texto : String
		*/
		Sexo comprobarSexo(string texto) {
			Sexo contenedor = ERROR;

			if (texto == "Hombre")
			{
				contenedor = HOMBRE;
			}
			else if(texto == "Mujer") {
				contenedor = MUJER;
			}
			else {
				cout << "Sexo mal escrito";
			}
			
			return contenedor;
		}
		/*
		* Metodo que recibe una enumeracion de tipo sexo y retorna su valor en formato de String
		* @param sexo : Sexo
		* @return String
		*/
		string convertirSexo(Sexo sexo) {
		
			string texto = "Error";

			switch (sexo) {
			case Sexo::HOMBRE:
				texto = "Hombre";
				break;
			case Sexo::MUJER:
				texto = "Mujer";
				break;
			default:
				cout << "Ha surgido un error";
				break;
			}
			
			return texto;
		}
		/*
		* Metodo toString parametrizado para la clase Persona
		*/
		string toString() {
			return "Persona[nombre =" + nombre + " numero = " + to_string(numero) + "sexo = " + convertirSexo(sexo) + "]";
		}

		



};
