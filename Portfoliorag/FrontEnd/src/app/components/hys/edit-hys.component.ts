import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Hys } from 'src/app/model/hys';
import { SHysService } from 'src/app/service/s-hys.service';


@Component({
  selector: 'app-edit-hys',
  templateUrl: './edit-hys.component.html',
  styleUrls: ['./edit-hys.component.css']
})
export class EditHysComponent implements OnInit {
  h: Hys = null;
  constructor(private sHys: SHysService, private activatedRouter: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    const id = this.activatedRouter.snapshot.params['id'];
    this.sHys.detail(id).subscribe(
      data =>{
        this.h = data;
      }, err =>{
        alert("Error al modificar la aptitud");
        this.router.navigate(['']);
      }
    )
  }

  onUpdate(): void{
    const id = this.activatedRouter.snapshot.params['id'];
    this.sHys.update(id, this.h).subscribe(
      data => {
        this.router.navigate(['']);
      }, err =>{
         alert("Error al modificar la aptitud");
         this.router.navigate(['']);
      }
    )
  }

}
