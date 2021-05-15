import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-tabs/src/vaadin-tabs.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';
import './vista-valoraciones.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-verproductoclientes.js';

class VistaVeproducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; align-self: stretch; padding: var(--lumo-space-xl); background-color: var(--lumo-contrast-10pct); margin: var(--lumo-space-xl); margin-top: var(--lumo-space-xs); margin-bottom: var(--lumo-space-xs);">
  <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 35%;">
   <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-shrink: 1;">
    <img style="flex-grow: 0; height: 30%; width: 45%; align-self: center; flex-shrink: 1;" id="img1-producto">
    <vaadin-horizontal-layout theme="spacing" id="vlCargarImagenes"></vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;">
   <vaadin-horizontal-layout theme="spacing">
    <h4>Nombre</h4>
    <label style="align-self: center;" id="label-nombre">Label</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <h4>Categoría</h4>
    <label style="align-self: center;" id="label-categoria">Label</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <h4>Precio</h4>
    <label style="align-self: center;" id="label-precio">Precio</label>
    <h4 id="h41">Precio anterior</h4>
    <label style="align-self: center;" id="label-precioanterior">Precio</label>
    <h4 id="h4">En oferta hasta</h4>
    <label style="align-self: center;" id="label-fechaoferta">Fecha</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <h4></h4>Valoración 
    <vaadin-horizontal-layout theme="spacing" id="hlValoracion"></vaadin-horizontal-layout>
    <label style="align-self: center;" id="label-nopiniones">0 opiniones</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" id="vlBotonComprar">
    <vista-verproductoclientes id="vistaVerproductoclientes"></vista-verproductoclientes>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: stretch; flex-grow: 1; margin: var(--lumo-space-xl); margin-top: var(--lumo-space-xs); margin-bottom: var(--lumo-space-xs);" id="vldescripcionAndValoracion">
  <vaadin-tabs style="align-self: stretch;" orientation="horizontal" selected="0" id="vaadinTabs">
   <vaadin-tab selected id="btnDescripcion">
     Descripción 
   </vaadin-tab>
   <vaadin-tab id="btnValoracion">
     Valoraciones 
   </vaadin-tab>
  </vaadin-tabs>
  <vaadin-vertical-layout theme="spacing" style="align-self: stretch; flex-grow: 1;" id="vlDescripcion">
   <label id="label-descripcion">Descripción</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: stretch; flex-grow: 1;" id="vlValoracion">
   <vista-valoraciones id="vistaValoraciones"></vista-valoraciones>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-veproducto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVeproducto.is, VistaVeproducto);
