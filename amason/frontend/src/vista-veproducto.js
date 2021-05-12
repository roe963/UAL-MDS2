import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-verproductoclientes.js';
import '@vaadin/vaadin-tabs/src/vaadin-tabs.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';
import './vista-valoraciones.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

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
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-vertical-layout theme="spacing">
    <img style="flex-grow: 0; height: 100%; width: 80%; align-self: center;" id="img1-producto">
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout">
     <img style="padding: var(--lumo-space-xl); flex-grow: 0;" id="img2-producto">
     <img style="padding: var(--lumo-space-xl); flex-grow: 0;" id="img3-producto">
     <img style="padding: var(--lumo-space-xl); flex-grow: 0;" id="img4-producto">
     <img style="padding: var(--lumo-space-xl); flex-grow: 0;" id="img5-producto">
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing">
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
   <vista-verproductoclientes id="vistaVerproductoclientes"></vista-verproductoclientes>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: stretch; flex-grow: 1; margin: var(--lumo-space-xl); margin-top: var(--lumo-space-xs); margin-bottom: var(--lumo-space-xs);">
  <vaadin-tabs style="align-self: stretch;" orientation="horizontal" selected="0">
   <vaadin-tab selected>
     Descripción 
   </vaadin-tab>
   <vaadin-tab>
     Valoraciones 
   </vaadin-tab>
  </vaadin-tabs>
  <vaadin-vertical-layout theme="spacing" style="align-self: stretch; flex-grow: 1;">
   <label id="label-descripcion">Descripción</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: stretch; flex-grow: 1;">
   <vista-valoraciones></vista-valoraciones>
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