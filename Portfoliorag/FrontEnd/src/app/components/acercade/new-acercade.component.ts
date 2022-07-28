import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Acercade } from 'src/app/model/acercade';
import { SAcercadeService } from 'src/app/service/s-acercade.service';


@Component({
  selector: 'app-new-acercade',
  templateUrl: './new-acercade.component.html',
  styleUrls: ['./new-acercade.component.css']
})
export class NewAcercadeComponent implements OnInit {
  nombreA: string = '';
  tituloA: string = '';
  acercadeA: string = '';
  imagenA: string = '';

  constructor(private sAcercade: SAcercadeService, private router: Router) { }

  ngOnInit(): void {
  }

  onCreate(): void {

    const acerca = new Acercade(this.nombreA, this.tituloA, this.acercadeA, this.imagenA);
    this.sAcercade.save(acerca).subscribe(
      data => {
        alert("Persona añadida");
        this.router.navigate(['']);
      }, err => {
        alert("Falló");
        this.router.navigate(['']);
      }
    )
  }

}
