#!/bin/bash
export APP_HOME=$(dirname $(realpath $0))

export JAVA_HOME="/cygdrive/c/Work/Java/AdoptOpenJDK/jdk-11.0.6.10-hotspot"
export PATH=$JAVA_HOME/bin:$PATH

ejecutarPrograma () {

    if [ -n "$1" ]
    then
        echo $APP_HOME
        $JAVA_HOME/bin/java -cp ./ OpcionesMenu $1
    else
        echo "Forma de uso $0 -afd|-afn|-check|-min"
    fi

}


if [ -n "$JAVA_HOME" ]
then
    echo "Empleando $JAVA_HOME"

    ejecutarPrograma $1

else
    echo "No se encontro la variable \$JAVA_HOME, favor definirla"
fi



