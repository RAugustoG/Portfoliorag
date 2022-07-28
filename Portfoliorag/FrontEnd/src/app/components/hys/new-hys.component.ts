import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Hys } from 'src/app/model/hys';
import { SHysService } from 'src/app/service/s-hys.service';

@Component({
  selector: 'app-new-hys',
  templateUrl: './new-hys.component.html',
  styleUrls: ['./new-hys.component.css']
})
export class NewHysComponent implements OnInit {
  nombrehys: string = '';
  porcentajehys: number;

  constructor(private sHys: SHysService, private router: Router) { }


  ngOnInit(): void {
  }

  onCreate(): void {

    const h = new Hys(this.nombrehys, this.porcentajehys);
    this.sHys.save(h).subscribe(
      data => {
        alert("Aptitud añadida");
        this.router.navigate(['']);
      }, err => {
        alert("Falló");
        this.router.navigate(['']);
      }
    )
  }


}
