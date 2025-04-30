public class Celsius extends Temperatura {

public Celsius(double graus){

super(graus);

}

//converter para Kelvin

public double paraKelvin(){

return getGraus()+273.15;

}

//converte para fahrenheit

public double paraFahrenheit(){

return (getGraus()*9/5)+32;

}




}