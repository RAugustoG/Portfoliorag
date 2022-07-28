export class Proyectos {
  id? : number;
    nombreP : string;
    descripcionP : string;
    fechaP: string;
    imagenP: string;
    urlP: string

    constructor(nombreP: string, descripcionP: string, fechaP: string, imagenP: string, urlP: string){
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.fechaP = fechaP;
        this.imagenP = imagenP;
        this.urlP = urlP;
    }
}
