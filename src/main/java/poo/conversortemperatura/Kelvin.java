public class Kelvin extends Temperatura {

public Kelvin(double grausTemp){

super(grausTemp);

}

//converter para Kelvin

public double paraCelsius(){

return getGraus ()- 273.15;

}

//converte para fahrenheit

public double paraFahrenheit(){

return ((getGraus()-273.15)*9/5)+32;

}


}
