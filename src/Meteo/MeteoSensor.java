package Meteo;

import java.time.*;

//Первоначальные датчики реализуют следующий интерфейс
public interface MeteoSensor{
	int getId(); // идентификатор датчика
	Float getTemperature(); // температура датчика
	Float getHumidity(); // влажность
	Float getPressure(); // давление
	LocalDateTime getDateTime(); // время чтения данных датчика
}