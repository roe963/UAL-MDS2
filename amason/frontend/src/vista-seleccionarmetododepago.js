import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-seleccionarmetododepago`
 *
 * VistaSeleccionarmetododepago element.
 *
 * @customElement
 * @polymer
 */
class VistaSeleccionarmetododepago extends PolymerElement {

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
        return 'vista-seleccionarmetododepago';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaSeleccionarmetododepago.is, VistaSeleccionarmetododepago);
