export class Educacion {
  id? : number;
    nombreE : string;
    descripcionE : string;
    fechadesdeE: string;
    fechahastaE: string;
    imagenE: string;

    constructor(nombreE: string, descripcionE: string, fechadesdeE: string, fechahastaE: string, imagenE: string){
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.fechadesdeE = fechadesdeE;
        this.fechahastaE = fechahastaE;
        this.imagenE = imagenE;
    }
}
