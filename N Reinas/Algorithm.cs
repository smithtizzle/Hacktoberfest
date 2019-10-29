/* Esta es la función que hace todo el trabajo, nosotros
sólo tendríamos que hacer un for por cada reina que vayamos
a usar */

private Boolean Verificar() // Función que verifica sí hay reinas que se atacan entre sí
{
    for (int i = 0; i < 5; i++)
    {
        for (int j = i + 1; j < 5; j++)                                    //Para que dos reinas, i y j, ocupen la misma diagonal se debe cumplir que la distancia (número de casillas)
        {                                                                  //que hay entre sus respectivas columnas (valores de i y de j) sea igual a la distancia que hay entre sus respectivas filas (valores x[i] y x[j]).
            if (Math.Abs(i - j) == Math.Abs(tablero[i] - tablero[j]))      //Y dado que la distancia entre dos números cualesquiera es el valor de la diferencia entre ambos,
                return false;                                              //tenemos que para que dos reinas ocupen la misma diagonal se debe cumplir que |i-j| = |x[i]-x[j]|.
            if (tablero[i] == tablero[j])
                return false;
        }
    }
    return true;
}