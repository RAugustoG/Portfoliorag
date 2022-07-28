import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Acercade } from 'src/app/model/acercade';
import { SAcercadeService } from 'src/app/service/s-acercade.service';


@Component({
  selector: 'app-edit-acercade',
  templateUrl: './edit-acercade.component.html',
  styleUrls: ['./edit-acerdade.component.css']
})
export class EditAcercadeComponent implements OnInit {
  acerca: Acercade = null;
  constructor(private sAcercade: SAcercadeService, private activatedRouter: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    const id = this.activatedRouter.snapshot.params['id'];
    this.sAcercade.detail(id).subscribe(
      data =>{
        this.acerca = data;
      }, err =>{
        alert("Error al modificar persona");
        this.router.navigate(['']);
      }
    )
  }

  onUpdate(): void{
    const id = this.activatedRouter.snapshot.params['id'];
    this.sAcercade.update(id, this.acerca).subscribe(
      data => {
        this.router.navigate(['']);
      }, err =>{
         alert("Error al modificar persona");
         this.router.navigate(['']);
      }
    )
  }
}
