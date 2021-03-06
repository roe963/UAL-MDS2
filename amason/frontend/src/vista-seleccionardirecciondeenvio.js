import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-seleccionardirecciondeenvio`
 *
 * VistaSeleccionardirecciondeenvio element.
 *
 * @customElement
 * @polymer
 */
class VistaSeleccionardirecciondeenvio extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-seleccionardirecciondeenvio';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaSeleccionardirecciondeenvio.is, VistaSeleccionardirecciondeenvio);
