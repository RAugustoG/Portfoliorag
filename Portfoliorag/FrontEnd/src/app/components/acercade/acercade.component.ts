import { Component, OnInit } from '@angular/core';
import { Acercade } from 'src/app/model/acercade';
import { SAcercadeService } from 'src/app/service/s-acercade.service';
import { TokenService } from 'src/app/service/token.service';


@Component({
  selector: 'app-acercade',
  templateUrl: './acercade.component.html',
  styleUrls: ['./acercade.component.css']
})
export class AcercadeComponent implements OnInit {
  acerca: Acercade [] = [];
  constructor(private sAcercade: SAcercadeService, private tokenService: TokenService) { }

  isLogged = false;
  ngOnInit(): void {
    this.cargarAcercade();
    if (this.tokenService.getToken()) {
      this.isLogged = true;
    } else {
      this.isLogged = false;
    }
  }

  cargarAcercade(): void {
    this.sAcercade.lista().subscribe(data => { this.acerca = data; })
  }
  delete(id?: number){
    if(id != undefined){
      this.sAcercade.delete(id).subscribe(
        data => {
          this.cargarAcercade();
        }, err => {
          alert("No se pudo borrar la persona");
        }
      )
    }
  }

}
