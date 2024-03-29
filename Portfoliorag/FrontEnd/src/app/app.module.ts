
import { HttpClientModule } from "@angular/common/http";
import { NgModule } from "@angular/core";
import { FormsModule } from "@angular/forms";
import { BrowserModule } from "@angular/platform-browser";
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgCircleProgressModule } from "ng-circle-progress";
import { AppRoutingModule } from "./app-routing.module";
import { AppComponent } from "./app.component";
import { AcercadeComponent } from "./components/acercade/acercade.component";
import { BannerComponent } from "./components/banner/banner.component";
import { EducacionComponent } from "./components/educacion/educacion.component";
import { EncabezadoComponent } from "./components/encabezado/encabezado.component";
import { ExperienciaComponent } from "./components/experiencia/experiencia.component";
import { FooterComponent } from "./components/footer/footer.component";
import { HeaderComponent } from "./components/header/header.component";
import { HomeComponent } from "./components/home/home.component";
import { HysComponent } from "./components/hys/hys.component";
import { LoginComponent } from "./components/login/login.component";
import { ProyectosComponent } from "./components/proyectos/proyectos.component";
import { interceptorProvider } from "./service/interceptor-service";
import { NewExperienciaComponent } from './components/experiencia/new-experiencia.component';
import { EditExperienciaComponent } from './components/experiencia/edit-experiencia.component';
import { NewEducacionComponent } from './components/educacion/new-educacion.component';
import { EditEducacionComponent } from './components/educacion/edit-educacion.component';
import { NewAcercadeComponent } from "./components/acercade/new-acercade.component";
import { EditAcercadeComponent } from "./components/acercade/edit-acercade.component";
import { NewHysComponent } from './components/hys/new-hys.component';
import { EditHysComponent } from './components/hys/edit-hys.component';
import { EditProyectosComponent } from './components/proyectos/edit-proyectos.component';
import { NewProyectosComponent } from "./components/proyectos/new-proyectos.component";



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    EncabezadoComponent,
    BannerComponent,
    AcercadeComponent,
    ExperienciaComponent,
    EducacionComponent,
    HysComponent,
    ProyectosComponent,
    FooterComponent,
    HomeComponent,
    LoginComponent,
    NewExperienciaComponent,
    EditExperienciaComponent,
    NewEducacionComponent,
    EditEducacionComponent,
    NewAcercadeComponent,
    EditAcercadeComponent,
    NewHysComponent,
    EditHysComponent,
    NewProyectosComponent,
    EditProyectosComponent,


  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    FormsModule,
    NgCircleProgressModule.forRoot({}),
    HttpClientModule
  ],
  providers: [
    interceptorProvider
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
